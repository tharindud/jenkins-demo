@Library('supabase_jenkins_shared_lib@main') _

pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
                success {
                    script {
                        blazetest.service("zqnfqneukwmmvzxqxssb.supabase.co")
                            .trace()
                            .license("ABCDE-FGHIJ-KLMNO-PQRST")
                            .authorization("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InpxbmZxbmV1a3dtbXZ6eHF4c3NiIiwicm9sZSI6ImFub24iLCJpYXQiOjE2OTUwNzkzNzAsImV4cCI6MjAxMDY1NTM3MH0.EQqV1X4uaPXF2q8iZEsrv83ZiHrtxyG-T407_PvIYPk")
                            .metadata("BUILD_ID", "${env.BUILD_ID}")
                            .metadata("BUILD_NUMBER", "${env.BUILD_NUMBER}")
                            .metadata("BUILD_TAG", "${env.BUILD_TAG}")
                            .junit()
                            .upload(readFile("target/surefire-reports/TEST-jenkins.demo.TestCalculator.xml"));
                    }
                }
            }
        }
    }
}
