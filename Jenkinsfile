pipeline {
  agent any

triggers {
        githubPush()  // For GitHub webhooks
    }

  stages {
   stage('Checkout') {
            steps { checkout scm }
        }

    stage('SonarQube Analysis') {
      steps {
        withSonarQubeEnv('SonarQube') {
          sh "mvn sonar:sonar -Dsonar.projectKey=Spring-Boot-Application"
        }
      }
    }
      }
    }

    

