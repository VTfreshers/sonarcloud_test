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
  					-Dsonar.projectKey=VTfreshers_sonarcloud_test \\
  					-Dsonar.organization=vtfreshers-github \\
  					-Dsonar.host.url=https://sonarcloud.io \\
  					-Dsonar.login=413636f44376b5ce6a179d443ec50a3992f96f4f'''
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
