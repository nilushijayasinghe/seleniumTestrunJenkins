pipeline {
    agent any
    stages{
        stage('Compile Stage'){

            steps {
				sh 'rm -rf chat_bot_rc'
                sh 'git clone https:https://github.com/nilushijayasinghe/seleniumTestrunJenkins.git seleniumTestrunJenkins_rc'
                sh 'seleniumTestrunJenkins_rc'
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