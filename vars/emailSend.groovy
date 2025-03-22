def call (String currentBuild) {
    if (${currentBuild} == "SUCCESS"){
        
            emailext attachLog: true, 
                     body: "Pipeline ran successfully, check it here ${JOB_URL}", 
                     subject: "SUCCESSFUL JOB: job name: ${JOB_NAME}, build number ${BUILD_NUMBER}", 
                     to: "testingdevops77@gmail.com"

    }
    else if (${currentBuild} == "FAILURE"){
            emailext attachLog: true, 
                     body: "Pipeline Failed, check it here ${JOB_URL}", 
                     subject: "FAILED JOB: job name: ${JOB_NAME}, build number ${BUILD_NUMBER}", 
                     to: "testingdevops77@gmail.com"
    }
    else{
            emailext attachLog: true, 
                     body: "STATUS UNKNOWN, check it here ${JOB_URL}", 
                     subject: "UNKNOWN STATUS job name: ${JOB_NAME}, build number ${BUILD_NUMBER}", 
                     to: "testingdevops77@gmail.com"
    }
}
