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
        // wait for SonarQube analysis to be completed and get the quality gate result
        stage('Quality Gate') {       
            steps {
                timeout(time: 1, unit: 'MINUTES') {
                    waitForQualityGate abortPipeline: true
                }
            }
        }

        stage ('SCA Scan') {
            steps {
                sh " mvn dependency-check:check "
             }
             post {
                always {
                    dependencyCheckPublisher pattern: 'target/dependency-check-report.xml'
                }
        }
        }

        stage('Maven Build') {
            steps {
                sh " mvn clean package "
            }
            
        }
        stage('Docker Build and Push') {
            steps {
                withDockerRegistry([credentialsId: "dockercred", url: ""]) {
          sh 'printenv'
          sh 'docker build -t masudrana09/spring-boot-application:latest .'
          sh 'docker push masudrana09/spring-boot-application:latest'
                }
        }
      }

             }

    }

    

