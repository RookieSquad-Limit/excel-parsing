package com.rookiesquad.excelparsing.listener.head;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

import java.util.Map;

public abstract class CustomHeadExcelListener extends AnalysisEventListener<Map<Integer, String>> {

    protected int headerRow = -1;

    /**
     * 读取完数据的操作
     *
     * @param analysisContext
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
    }

    public int getHeaderRow() {
        return headerRow;
    }

    public void setHeaderRow(int headerRow) {
        this.headerRow = headerRow;
    }
}
