pipeline {
    agent any

    stages {
        stage('Building') {
            steps {
                echo 'Building the Dev project'
            }
        }
         stage('Testing') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/w2a/Selenium4Grid.git']]])
                sh 'mvn clean test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying the code on Staging server'
            }
        }
    }
}
