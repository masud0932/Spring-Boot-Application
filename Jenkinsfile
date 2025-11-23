pipeline {
  agent any

triggers {
        githubPush()  // For GitHub webhooks
    }
    
  stages {
   stage('Checkout') {
            steps { checkout scm }
        }

    stage('Secret Detection') {
            steps {
                script {
                    sh '''
                        gitleaks detect --source . --verbose --redact
                    '''}
            }
    }
    stage('SonarQube Analysis') {
      steps {
        withSonarQubeEnv('SonarQube') {
          sh "mvn sonar:sonar -Dsonar.projectKey=sonarcred"
        }
      }
    }
      }
    }

    

