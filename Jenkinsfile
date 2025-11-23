pipeline {
    agent any

    tools {
        maven 'maven'   // use the name you configured in Jenkins
    }

    stages {

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('SonarQube') {
                    sh '''
                        mvn clean verify sonar:sonar \
                        -Dsonar.projectKey=Spring-Boot-Application \
                        -Dsonar.host.url=http://16.16.200.43:9000/
                    '''
                }
            }
        }

        stage('Quality Gate') {
            steps {
                timeout(time: 2, unit: 'MINUTES') {
                    waitForQualityGate abortPipeline: true
                }
            }
        }

    }
}

    

