pipeline {
  agent any

  stages {
    stage('SonarQube Analysis') {
      withSonarQubeEnv() {
      sh "${mvn}/bin/mvn clean verify sonar:sonar -Dsonar.projectKey=Spring-Boot-Application"
    }
  }
    }
}
    

    

