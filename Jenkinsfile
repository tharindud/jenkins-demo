@Library('supabase_jenkins_shared_lib') _

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
                script {
                    service("zqnfqneukwmmvzxqxssb.supabase.co")
                        .trace()
                        .license("ABCDE-FGHIJ-KLMNO-PQRST")
                        .authorization("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InpxbmZxbmV1a3dtbXZ6eHF4c3NiIiwicm9sZSI6ImFub24iLCJpYXQiOjE2OTUwNzkzNzAsImV4cCI6MjAxMDY1NTM3MH0.EQqV1X4uaPXF2q8iZEsrv83ZiHrtxyG-T407_PvIYPk")
                        .metadata("name", "jenkins-demo")
                        .metadata("build", "67")
                        .junit()
                        .upload("target/surefire-reports/TEST-jenkins.demo.TestCalculator.xml");
                }
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
    }
}
