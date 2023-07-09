package org.wangpai.remotedeployment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @since 2023-7-10
 */
@Controller
@RequestMapping("/remote_deployment")
public class RemoteDeploymentController {
    /**
     * @since 2023-7-10
     */
    @GetMapping("/test")
    @ResponseBody
    public String remoteDeploymentTest(String para) {
        System.out.println(para);
        return para;
    }
}
