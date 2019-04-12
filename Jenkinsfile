pipeline {
	agent any
	stages {
	    stage ('build') {
			 steps {
			     echo "Building the sourcecode"
			 }
		}
		stage ("Code Analysis")
			{
				steps
				{
					sh label: '', script: '''mvn sonar:sonar \\
  -Dsonar.projectKey=VTfreshers_maven-simple \\
  -Dsonar.organization=vtfreshers-github \\
  -Dsonar.host.url=https://sonarcloud.io \\
  -Dsonar.login=86f2205b0f36770c30a9182a88df03ce703441d4'''
				}
			}
	    stage ('test'){	
		parallel {
			stage ('test: integration-&-quality') {
				 steps {
			     		echo "Testing is in progresss"
			 	}
			}
			stage ('test: functional') {
				 steps {
			     		echo "Functional test is going on"
			 		}
			}
			stage ('test: load-&-security') {
				  steps {
			      		echo "Load & Security"
			  		}
			}
		}
	    }
		stage ('approval') {
			  steps {
			      echo "Approval"
			  }
		}
		stage ('deploy:prod') {
			  steps {
			      echo "deploy"
			  }
		}
	}
}
