# BaiduFanYiDemo
百度翻译的[官方Java Demo](https://fanyiapp.cdn.bcebos.com/api/demo/java.zip)的响应是JSON数据,不能直接得到译文,所以本项目做了二次开发,可以从JSON数据中提取出完整的译文.
本项目处理JSON的工具为FastJSON,FastJSON的jar包,已经放在lib目录下了,导入到build path即可使用.也可以根据需要替换成其他版本的jar包.

BaiduFanYi.properties是配置文件,请到百度翻译API上获取到的APP_ID和秘钥.
