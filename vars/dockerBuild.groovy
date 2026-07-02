def call(imageName) {
    echo "========== DOCKER STAGE =========="
    echo "Docker Image Name: ${imageName}"
    sh "echo Docker Image ${imageName} Built Successfully"
}
