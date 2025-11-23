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
    stage('javaa version') {
      steps {
        sh "java -version"
      }
    }
    }
}
