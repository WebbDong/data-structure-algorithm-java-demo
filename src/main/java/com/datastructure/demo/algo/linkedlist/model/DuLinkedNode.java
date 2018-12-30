package com.datastructure.demo.algo.linkedlist.model;

import lombok.Data;

/**
 * @Description:    双向链表节点
 * @Author:         Webb Dong
 * @CreateDate:     2018/12/24 16:35
 * @UpdateUser:     Webb Dong
 * @UpdateDate:     2018/12/24 16:35
 * @UpdateRemark:
 * @Version:        1.0.0
 */
@Data
public class DuLinkedNode<T> {

    /**
     * 数据元素
     */
    private T data;

    /**
     * 上一个节点
     */
    private DuLinkedNode<T> previous;

    /**
     * 下一个节点
     */
    private DuLinkedNode<T> next;

    public DuLinkedNode(T data) {
        this.data = data;
    }

}
