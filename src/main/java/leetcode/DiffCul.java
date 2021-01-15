package leetcode;

/**
 * @author : xiongyanjun  Date: 2020/11/13 ProjectName: settleprovisions Version: 1.0
 */
public class DiffCul {
    public static void main(String[] args) {
        System.out.println(cul(1284163777L,332839311L,3459601L,1976782L));
    }

    //网联微信
    //517092993L,
    //532643746L,12429183L,3121570L
    //532846592L,12444455L,3121570L

    //514416814L,
    //527578004L,10055651L,3105539L
    //527798633L,10057606L,3105539L

    //

    public static Long cul(Long a,Long b,Long c,Long d){
        return a-b+c+d;
    }
}
//日期   acs       订单金额   申请退款金额 手续费
//11.04,955326231,974750121,13648233,5765859
//11.05,735997061,750763591,10324411,4442134
//11.06,618014207,633858037,12084686,3730137
//11.09,
//11.10,534158449,550824208,13202450,3224588


//1284163777L,333049929L,3461516L,1976782L
