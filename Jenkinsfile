@Library('supabase_jenkins_shared_lib@main') _

pipeline {
    agent any

    environment {
        BLAZETEST_HOST = 'zqnfqneukwmmvzxqxssb.supabase.co'
        BLAZETEST_LICENSE = 'ABCDE-FGHIJ-KLMNO-PQRST'
        BLAZETEST_AUTHORIZATION = 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InpxbmZxbmV1a3dtbXZ6eHF4c3NiIiwicm9sZSI6ImFub24iLCJpYXQiOjE2OTUwNzkzNzAsImV4cCI6MjAxMDY1NTM3MH0.EQqV1X4uaPXF2q8iZEsrv83ZiHrtxyG-T407_PvIYPk'
        BLAZETEST_TRACE = 'true'
    }

    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
                sh 'cp src/test/resources/junit-results.xml target/surefire-reports/'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                    script {
                        blazetest.junitExtractor(readFile("target/surefire-reports/junit-results.xml"));
                    }
                }
            }
        }
    }
}
