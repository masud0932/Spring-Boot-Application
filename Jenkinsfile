pipeline {
    agent any

    stages {

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('SonarQube') {
                    sh """
                        mvn sonar:sonar -Dsonar.projectKey=Spring-Boot-Application
                    """
                }
            }
        }

    }
}
    

    

