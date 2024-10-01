# Spigot Protection Plugins

這個項目包含了一系列用於Spigot服務器的保護插件,旨在提供基本的遊戲行為控制。這些插件是基於Spigot API 1.8.8版本開發的。

## 功能

本項目包含以下保護插件:

1. **AntiPlaceBlock**: 禁止放置方塊
2. **AntiDestroyBlock**: 禁止破壞方塊
3. **AntiInvClick**: 禁止移動背包物品
4. **AntiThrowItem**: 禁止丟出物品
5. **AntiPvPAttack**: 禁止PvP攻擊行為

## 安裝

1. 將編譯後的.jar文件放入您Spigot服務器的`plugins`文件夾中。
2. 重新啟動服務器或使用插件重載命令。

## 使用方法

每個保護插件都有統一的API方法:

- `setEnabled(boolean enabled)`: 啟用或禁用該功能
- `isEnabled()`: 檢查該功能是否啟用

示例:

```java
// 在您的主插件類中
AntiPlaceBlock antiPlace = new AntiPlaceBlock();
getServer().getPluginManager().registerEvents(antiPlace, this);

// 禁用方塊放置保護
antiPlace.setEnabled(false);

// 檢查狀態
boolean isEnabled = antiPlace.isEnabled();
```

## 注意事項

1. 這些插件預設情況下會影響所有玩家。如果需要更細緻的控制,您可能需要修改代碼以添加權限檢查或區域限制。
2. 確保在啟用這些保護功能時不會過度限制玩家的正常遊戲體驗。
3. 這些插件可以根據需求進行進一步的擴展,如添加日誌記錄、發送警告消息等功能。

## 貢獻

歡迎提交問題報告和改進建議。如果您想貢獻代碼,請先開啟一個issue討論您的想法。

## 許可證

[在此插入您的許可證信息]

## 聯繫方式

 - Gmail : allenmc.su@gmail.com
 - Website : https://www.allenpixel.com
 - Discord : allentw0524
