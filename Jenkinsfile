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
                sh 'curl -L -o junit-xml-merger.jar https://github.com/codeclou/java-junit-xml-merger/releases/download/1.0.1/junit-xml-merger.jar'
                sh 'java -jar junit-xml-merger.jar -i=target/surefire-reports/ -o=target/junit-results.xml -s="jenkins.demo"'
                sh 'cat target/junit-results.xml'
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
                            .metadata("name", "jenkins-demo")
                            .metadata("build", "67")
                            .junit()
                            .upload(readFile("target/junit-results.xml"));
                    }
                }
            }
        }
    }
}
