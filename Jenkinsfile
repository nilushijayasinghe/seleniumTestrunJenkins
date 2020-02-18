pipeline {
    agent any
    stages{
        stage('Compile Stage'){

            steps {
				sh 'rm -rf seleniumTestrunJenkins_rc'
                sh 'git clone https://github.com/nilushijayasinghe/seleniumTestrunJenkins.git seleniumTestrunJenkins_rc'
                sh 'cd seleniumTestrunJenkins_rc'
                sh 'mvn clean compile'
             }
        }

            stage('Testing stage'){
                steps {
                     sh 'mvn test -Dwebdriver.type=chrome -Dwebdriver.chrome.driver=/home/nilushi/Documents/chatbot/Chat_Bot_Regeression_Cycle/libs/chromedriver'
                    }
                }

            stage ('Package stage'){
                steps{
                    sh 'mvn package'
                    }
                }

            }

         }