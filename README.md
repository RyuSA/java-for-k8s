JavaエンジニアのためのKubernetes入門
===

本リポジトリはインプレスR&D社から発行されている[『JavaエンジニアのためのKubernetes入門』](https://nextpublishing.jp/isbn/9784295601128
)で利用するサンプルアプリケーションのプロジェクトリポジトリです。

このリポジトリをCloneして書籍の内容をトレースできます。

```bash
$ git clone https://github.com/RyuSA/java-for-k8s.git
$ code java-for-k8s
$ ./gradlew build
```

## Requirements

### Visual Studio CodeのRemote Developmentを利用する場合
IDEのVisual Studio Codeの拡張機能であるRemote Developmentを利用すると、手元の環境を汚すことなく書籍の内容をコンテナの中で実行することができます。
https://code.visualstudio.com/docs/devcontainers/containers

必要なツール
- [Visual Studio Code](https://azure.microsoft.com/ja-jp/products/visual-studio-code/)
- [Docker Desktop](https://www.docker.com/products/docker-desktop/)

### その他の場合
WindowsやMacなどのパソコンでトレースする場合、次のソフトウェア/ツールをインストールしておく必要があります

必要なツール
- お好みのIDE
- JDK(Java 17+)
- kubectl(1.23+)
- [Docker Desktop](https://www.docker.com/products/docker-desktop/)
- [kind](https://kind.sigs.k8s.io/) or [Minikube](https://minikube.sigs.k8s.io/)
