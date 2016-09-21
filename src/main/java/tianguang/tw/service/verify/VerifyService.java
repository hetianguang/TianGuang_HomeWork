package tianguang.tw.service.verify;

import tianguang.tw.entity.ATimeData;

/**
 * Created by He on 2016/9/21.
 */
public interface VerifyService {
    public boolean isInputValidity(ATimeData aTimeData);
    public boolean isDataTrue(ATimeData aTimeData);

}
