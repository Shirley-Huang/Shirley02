package com.dandan.test;

//import com.aliyuncs.DefaultAcsClient;
//import com.aliyuncs.auth.sts.AssumeRoleRequest;
//import com.aliyuncs.auth.sts.AssumeRoleResponse;
//import com.aliyuncs.http.MethodType;
//import com.aliyuncs.http.ProtocolType;
//import com.aliyuncs.profile.DefaultProfile;
//import com.aliyuncs.profile.IClientProfile;

//import com.sun.deploy.net.protocol.ProtocolType;

public class OssAutentic {

    public static void main(String[] args) throws Exception {
//            String endpoint = "sts.aliyuncs.com";
//        String accessKeyId = "LTAISAbCAwKri2bR";
//        String accessKeySecret = "1Kw2zTcE9DBYeU426JXMKZWULUve8v";
//        String roleArn = "acs:ram::1439262924062547:role/dev-bigfish-oss";
//        //roleSessionName时临时Token的会话名称，自己指定用于标识你的用户，或者用于区分Token颁发给谁
//        //要注意roleSessionName的长度和规则，不要有空格，只能有'-'和'_'字母和数字等字符
//        String roleSessionName = "session-name";
//        String policy = "{\n" +
//                "  \"Version\": \"1\",\n" +
//                "  \"Statement\": [\n" +
//                "    {\n" +
//                "      \"Action\": \"oss:*\",\n" +
//                "      \"Resource\": \"*\",\n" +
//                "      \"Effect\": \"Allow\"\n" +
//                "    }\n" +
//                "  ]\n" +
//                "}";
//        ProtocolType protocolType = ProtocolType.HTTPS;
//        try {
//            //DefaultProfile.addEndpoint("", "cn-shanghai", "Sts", endpoint);
//            DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", "Sts", endpoint);
//
//            IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId, accessKeySecret);
//            DefaultAcsClient client = new DefaultAcsClient(profile);
//            final AssumeRoleRequest request = new AssumeRoleRequest();
//            request.setMethod(MethodType.POST);
//            request.setRoleArn(roleArn);
//            request.setRoleSessionName(roleSessionName);
//            request.setPolicy(policy);
//            request.setProtocol(protocolType);
//            final AssumeRoleResponse response = client.getAcsResponse(request);
//            System.out.println("=============" + response.getCredentials().getAccessKeyId());
//            System.out.println("=============" + response.getCredentials().getAccessKeySecret());
//            System.out.println("=============" + response.getCredentials().getSecurityToken());
//        } catch (ClientException e) {
//            e.printStackTrace();
//        }


//        ProtocolType protocolType = ProtocolType.HTTPS;
//
//        String policy = "{\n" +
//                "  \"Version\": \"1\",\n" +
//                "  \"Statement\": [\n" +
//                "    {\n" +
//                "      \"Action\": \"oss:*\",\n" +
//                "      \"Resource\": \"*\",\n" +
//                "      \"Effect\": \"Allow\"\n" +
//                "    }\n" +
//                "  ]\n" +
//                "}";
//
//        IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAISAbCAwKri2bR",
//                "1Kw2zTcE9DBYeU426JXMKZWULUve8v");
//        DefaultAcsClient client = new DefaultAcsClient(profile);
//        final AssumeRoleRequest request = new AssumeRoleRequest();
//        request.setMethod(MethodType.POST);
//        request.setRoleArn("acs:ram::1439262924062547:role/dev-bigfish-oss");
//        request.setRoleSessionName("session.dev");
//        request.setProtocol(protocolType);
//        request.setPolicy(policy);
//        final AssumeRoleResponse response = client.getAcsResponse(request);
//        System.out.println(response);
    }
}