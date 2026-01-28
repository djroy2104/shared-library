@library('my-shared-lib')

pipeline{
    agent any
    tools{
        maven 'maven3.9.12'
        java 'java17'
    }

    stages{
        stage('checkout'){
	    steps{
	    git branch: 'master' ,url:''
	    }
	}
	stage('build'){
	    steps{
	    mavenbuild()
	    }
        }

    
    }
}    



