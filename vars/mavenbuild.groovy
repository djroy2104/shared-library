def call(){
    stage('building the maven'){
        sh 'mvn clean package'
    }	
}
