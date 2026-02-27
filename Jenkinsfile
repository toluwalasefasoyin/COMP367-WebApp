pipeline {
    agent any

    tools {
        maven 'Maven3'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',
                url: 'https://github.com/toluwalasefasoyin/COMP367-WebApp.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Archive') {
            steps {
                archiveArtifacts artifacts: 'target/*.war', fingerprint: true
            }
        }
    }

    post {
        success {
            echo 'Build Successful'
        }
        failure {
            echo 'Build Failed'
        }
    }
}