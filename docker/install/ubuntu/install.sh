#!/bin/bash

# Docker 설치 스크립트 (Ubuntu용)

# 함수 정의: 에러 메시지 출력 후 스크립트 종료
function error_exit {
    echo "오류: $1"
    exit 1
}

# Docker 설치 전 필요한 패키지 설치
sudo apt-get update || error_exit "apt-get 업데이트 실패"
sudo apt-get install -y apt-transport-https ca-certificates curl software-properties-common || error_exit "패키지 설치 실패"

# Docker의 공식 GPG 키 추가
curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add - || error_exit "GPG 키 추가 실패"

# Docker의 안정적인 저장소 추가
sudo add-apt-repository "deb [arch=amd64] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable" || error_exit "저장소 추가 실패"

# Docker Engine 설치
sudo apt-get update || error_exit "apt-get 업데이트 실패"
sudo apt-get install -y docker-ce docker-ce-cli containerd.io || error_exit "Docker 설치 실패"

# 현재 사용자를 Docker 그룹에 추가 (선택적)
sudo usermod -aG docker $USER || error_exit "사용자를 Docker 그룹에 추가하는 데 실패했습니다."

# Docker 서비스 시작
sudo systemctl start docker || error_exit "Docker 서비스 시작 실패"

# Docker 서비스 활성화 (부팅 시 자동 실행)
sudo systemctl enable docker || error_exit "Docker 서비스 활성화 실패"

# 설치 확인
docker --version || error_exit "Docker 버전 확인 실패"

echo "Docker 설치가 완료되었습니다."
