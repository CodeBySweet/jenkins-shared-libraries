def call () {
    emailext attachLog: true, 
             body: 'Pipeline rn successfully, check it here ${JOB_URL}', 
             subject: 'SUCCESSFUL JOB: job name: ${JOB_NAME}, build number ${BUILD_NUMBER}', 
             to: 'testingdevops77@gmail.com'
}