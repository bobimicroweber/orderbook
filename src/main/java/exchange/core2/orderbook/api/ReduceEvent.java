/*
 * Copyright 2020 Maksim Zheravin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package exchange.core2.orderbook.api;

import java.util.Objects;

public class ReduceEvent {

    private final long reducedSize;
    private final long price;
    private final long reservedBidPrice;

    public ReduceEvent(long reducedSize,
                       long price,
                       long reservedBidPrice) {

        this.reducedSize = reducedSize;
        this.price = price;
        this.reservedBidPrice = reservedBidPrice;
    }

    public long getReducedSize() {
        return reducedSize;
    }

    public long getPrice() {
        return price;
    }

    public long getReservedBidPrice() {
        return reservedBidPrice;
    }

    @Override
    public String toString() {
        return "ReduceEvent{" +
                "reducedSize=" + reducedSize +
                ", price=" + price +
                ", reservedBidPrice=" + reservedBidPrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReduceEvent that = (ReduceEvent) o;
        return reducedSize == that.reducedSize &&
                price == that.price &&
                reservedBidPrice == that.reservedBidPrice;
    }

    @Override
    public int hashCode() {
        return Objects.hash(reducedSize, price, reservedBidPrice);
    }
}
