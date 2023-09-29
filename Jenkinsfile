@Library('github.com/tharindud/jenkins-sharedlib')

pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                log.info 'running build'
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                log.info 'running tests'
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
    }
}
