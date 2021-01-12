//package com.blyx.domain.order.model;
//
//import com.blyx.common.model.BaseMO;
//import lombok.Data;
//
//import java.io.Serializable;
//import java.util.Date;
//
///**
// * @author quyang5
// * @description
// * @date 15:53 2021/1/12
// */
//@Data
//public class OrderFsMO extends BaseMO implements Serializable {
//    private static final long serialVersionUID = -668131878334418738L;
//
//    /**
//     * 主键ID
//     *
//     * */
//    private Long id;
//
//    /**
//     * 订单编码
//     *
//     * */
//    private String order_code;
//    /**
//     * 订单类型
//     * 1：防水
//     *
//     * */
//    private Integer type;
//    /**
//     * 用户姓名
//     *
//     * */
//    private String user_name;
//
//    /**
//     * 用户手机号
//     *
//     * */
//    private String user_mobile;
//    /**
//     * 订单省份编码
//     *
//     * */
//    private Integer order_province_code;
//
//    /**
//     * 订单城市编码
//     *
//     * */
//    private Integer order_city_code;
//    /**
//     * 订单地区编码
//     *
//     * */
//    private Integer order_area_code;
//    /**
//     * 订单省份名称
//     *
//     * */
//    private String order_province_name;
//    /**
//     * 订单城市名称
//     *
//     * */
//    private String order_city_name;
//    /**
//     * 订单地区名称
//     *
//     * */
//    private String order_area_name;
//    /**
//     * 订单详细地址
//     *
//     * */
//    private String order_address_detail;
//    /**
//     * 订单状态
//     *
//     * */
//    private Integer status;
//    /**
//     * 工人编码
//     *
//     * */
//    private String worker_pin;
//    /**
//     * 总金额
//     *
//     * */
//    private Integer sum_amount;
//    /**
//     * 工人分配金额
//     *
//     * */
//    private Integer worker_amount;
//    /**
//     * 手续费
//     *
//     * */
//    private Integer service_charge;
//    /**
//     * 客户的订单描述
//     *
//     * */
//    private String context;
//    /**
//     * 工人的订单备注
//     *
//     * */
//    private String worker_mark;
//    /**
//     * 修补区域
//     *
//     * */
//    private String repair_region;
//    /**
//     * 开始时间
//     *
//     * */
//    private Date start_time;
//    /**
//     * 结束时间
//     *
//     * */
//    private Date end_time;
//    /**
//     * 该订单评分
//     *
//     * */
//    private Integer score;
//    /**
//     * 用户评价
//     *
//     * */
//    private String user_evaluation;
//    /**
//     * 订单异常描述
//     *
//     * */
//    private String error_msg;
//    /**
//     * 订单异常编码
//     *
//     * */
//    private Integer error_code;
//
//}
