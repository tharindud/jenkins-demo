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
                script {
                    sh 'mvn test'
                    sh 'pwd'
                    sh 'id'
                    sh '/var/lib/jenkins/workspace/jenkins-demo/target/surefire-reports/TEST-jenkins.demo.TestCalculator.xml'
                    blazetest.service("zqnfqneukwmmvzxqxssb.supabase.co")
                        .trace()
                        .license("ABCDE-FGHIJ-KLMNO-PQRST")
                        .authorization("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InpxbmZxbmV1a3dtbXZ6eHF4c3NiIiwicm9sZSI6ImFub24iLCJpYXQiOjE2OTUwNzkzNzAsImV4cCI6MjAxMDY1NTM3MH0.EQqV1X4uaPXF2q8iZEsrv83ZiHrtxyG-T407_PvIYPk")
                        .metadata("name", "jenkins-demo")
                        .metadata("build", "67")
                        .junit()
                        .upload("/var/lib/jenkins/workspace/jenkins-demo/target/surefire-reports/TEST-jenkins.demo.TestCalculator.xml");
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
