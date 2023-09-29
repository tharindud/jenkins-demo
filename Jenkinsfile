@Library('github.com/tharindud/jenkins-sharedlib') _

pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    log.info 'running build'
                }
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                script {
                    log.info 'running tests'
                }
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
