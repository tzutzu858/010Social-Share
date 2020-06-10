# 010Social-Share
<p align="center"><img src="https://github.com/tzutzu858/ChallengeDailyUI/blob/master/Day01_10/10_Social%20Share/010social_share-01.png" width="700" >

## 分享APP訊息到其他APP的方式有兩種
一種是使用開放平台的API,每一個APP去實作,例如FB分享[FB官方文件說明](https://developers.facebook.com/docs/sharing/android/?sdk=maven)<br />
這種比較麻煩,跟寫FB登入一樣,需要金鑰,Fb應用程式編號等等<br />
寫完程式不能放在公開github,要不然像我一樣被關掉,因為API密鑰不能被洩漏T_T<br />
優點是功能比較多,分享內容、照片、影片、對話方塊等等,但每一個分享平台就要寫一次真的還挺麻煩<br />
<br />
另一種Social Share寫法不到20行就寫完了<br />
App指定接收某些意圖，讓App收到這個意圖，如果有多個App都指定接收這個意圖時，<br />
Android就會將這些App列出清單，使用者就可以自行選擇要用哪一種APP分享<br />
如果讓Android列出的APP清單不要某些特定APP,可以參考[這篇](https://stackoverflow.com/questions/9730243/how-to-filter-specific-apps-for-action-send-intent-and-set-a-different-text-for)<br /><br />


## 主程式
```java
Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String sharesubject = "tzutzu的github";
                //subject：內容的標題。有些 App 會忽略
                myIntent.putExtra(Intent.EXTRA_SUBJECT, sharesubject);
                String shareBody = "https://github.com/tzutzu858";
                //body：想要分享的內容。可以放網址。
                myIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(myIntent, "你想要分享到哪裡呢?"));
                //chooserTitle：選擇器的標題。
```

## 成果展示

<img src="https://github.com/tzutzu858/ChallengeDailyUI/blob/master/Day01_10/10_Social%20Share/20200116_223636.gif" width="250" >
