package com.github.ryusa.javafork8s.controller;

import org.springframework.boot.info.BuildProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * アプリケーションのバージョン情報を返却するControllerクラス
 */
@RestController
public class VersionInfo {

  public VersionInfo(BuildProperties buildProperties) {
    this.buildProperties = buildProperties;
  }

  private final BuildProperties buildProperties;

  /*
   * 起動しているアプリケーションのバージョン情報を返却する
   * サンプルとして、ビルドした際のJarに含まれるメタデータの情報を参照します
   */
  @GetMapping(path = "/version")
  public String version() {
    return this.buildProperties.getVersion();
  }
}
