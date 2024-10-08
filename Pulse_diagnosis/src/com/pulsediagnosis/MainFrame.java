package com.pulsediagnosis;

import java.awt.*;
import java.awt.event.*;

// 主界面类
public class MainFrame extends Frame {

    public MainFrame() {
        // 设置窗口标题和布局
        setTitle("Pulse Diagnosis - 主界面");
        setSize(400, 300);
        setLayout(new FlowLayout());

        // 创建欢迎标签
        Label welcomeLabel = new Label("欢迎使用脉搏诊断系统", Label.CENTER);
        add(welcomeLabel);

        // 创建“开始诊断”按钮
        Button startButton = new Button("开始诊断");
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 点击按钮时打开诊断界面
                DiagnosisFrame diagnosisFrame = new DiagnosisFrame();
                diagnosisFrame.setVisible(true);
            }
        });
        add(startButton);

        // 创建“退出”按钮
        Button exitButton = new Button("退出");
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 点击按钮时退出程序
                System.exit(0);
            }
        });
        add(exitButton);

        // 窗口关闭事件
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        // 创建主界面并显示
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
    }
}

// 诊断界面类
class DiagnosisFrame extends Frame {

    private TextField pulseInput;
    private Label resultLabel;

    public DiagnosisFrame() {
        // 设置窗口标题和布局
        setTitle("脉搏诊断");
        setSize(400, 300);
        setLayout(new FlowLayout());

        // 输入脉搏数据的文本框
        Label inputLabel = new Label("请输入脉搏数据:");
        add(inputLabel);

        pulseInput = new TextField(20);
        add(pulseInput);

        // 创建“分析”按钮
        Button analyzeButton = new Button("分析");
        analyzeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 点击分析按钮后显示结果（这里简单展示输入数据）
                String pulseData = pulseInput.getText();
                resultLabel.setText("分析结果: " + pulseData);  // 这里你可以替换为真正的分析逻辑
            }
        });
        add(analyzeButton);

        // 显示分析结果的标签
        resultLabel = new Label("分析结果将显示在这里");
        add(resultLabel);

        // 创建“返回”按钮
        Button backButton = new Button("返回主界面");
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);  // 隐藏诊断窗口
            }
        });
        add(backButton);

        // 窗口关闭事件
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                setVisible(false);
            }
        });
    }
}
