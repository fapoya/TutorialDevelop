package com.techacademy.controller;

import org.springframework.web.bind.annotation.PostMapping;

public class LogoutController {
    /**ログアウト処理を行う*/
    @PostMapping("/logout")
    public String postLogout() {
        //login画面にリダイレクト
        return "redirect:/logout";
    }
}