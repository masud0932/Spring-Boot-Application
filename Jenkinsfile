pipeline {
  agent any

  stages {

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
                    // Method 1: Using installed Gitleaks binary
                    sh '''
                        gitleaks detect --source . --verbose --redact
                    '''}
            }
    }
    }
}
