pipeline {
  agent any

  stages {
   stage('Checkout') {
            steps { checkout scm }
        }

    stage('git version') {
      steps {
        sh "git version"
      }
    }

    stage('maven version') {
      steps {
        sh "mvn -v"
      }
    }
    stage('java version') {
      steps {
        sh "java -version"
      }
    }
    stage('Secret Detection') {
            steps {
                script {
                    sh '''
                        gitleaks detect --source . --verbose --redact
                    '''}
            }
    }
    }
}
