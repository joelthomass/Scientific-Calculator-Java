pipeline {
    agent any
    environment {
        DOCKER_IMAGE = 'joelthomass/scientific-calculator:latest'
    }
    stages {
	stage('Clone Repository') {
	    steps {
		git branch: 'main', url: 'https://github.com/joelthomass/Scientific-Calculator-Java.git'
	    }
	}
        stage('Build JAR') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Build Docker Image') {
            steps {
                sh 'docker build -t $DOCKER_IMAGE .'
            }
        }
        stage('Push to Docker Hub') {
            steps {
                withDockerRegistry([credentialsId: 'docker-hub-credentials', url: '']) {
                    sh 'docker push $DOCKER_IMAGE'
                }
            }
        }
        stage('Deploy using Ansible') {
            steps {
                sh 'ansible-playbook -i inventory.ini deploy.yml'
            }
        }
    }
}
