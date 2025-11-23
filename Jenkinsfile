pipeline {
  agent any

  stages {
   stage('Checkout') {
            steps { checkout scm }
        }

    stage('Secret detection') {
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

    

