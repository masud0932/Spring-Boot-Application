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
                        mvn sonar:sonar \
                        -Dsonar.projectKey=Spring-Boot-Application \
                        -Dsonar.host.url=http://16.16.200.43:9000/
                    '''
                }
            }
        }
        stage('Quality Gate') {       <!-- wait for SonarQube analysis to be completed and get the quality gate result -->
            steps {
                timeout(time: 1, unit: 'MINUTES') {
                    waitForQualityGate abortPipeline: true
                }
            }
        }

    }
}

    

