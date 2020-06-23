# BaiduFanYiDemo
百度翻译的[官方Java Demo](https://fanyiapp.cdn.bcebos.com/api/demo/java.zip)的响应是`JSON`数据,不能直接得到译文.
所以本项目做了二次开发,可以从`JSON`数据中提取出完整的译文.
## 依赖
本项目处理`JSON`的工具为`FastJSON,FastJSON`的`jar`包,已经放在`lib`目录下了,导入到`build path`即可使用.也可以根据需要替换成其他版本的`jar`包.
## 配置文件
`BaiduFanYi.properties`是配置文件,请到百度翻译`API`上获取到的`APP_ID`和秘钥.
