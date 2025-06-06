package com.javacode.adapter;

public class MemoryCardAdapter implements USB {
    private MemoryCard memoryCard;

    public MemoryCardAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public String readData() {
        return memoryCard.readFromCard();
    }
}
