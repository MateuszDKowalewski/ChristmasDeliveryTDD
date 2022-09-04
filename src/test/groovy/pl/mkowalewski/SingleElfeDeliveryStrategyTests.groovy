package pl.mkowalewski

import spock.lang.Specification

class SingleElfeDeliveryStrategyTests extends Specification {

    def "one packed present should be on sleigh"() {
        given:
        DeliveryStrategy deliveryStrategy = new SngleElfDeliveryStrategy()
        SantasSleigh sleigh = new TestSantaSleigh()
        Present present = new Present()

        when:
        sleigh.pack(present)

        then:
        noExceptionThrown()
        sleigh.countPresents() == 1
        sleigh.getPresent(0) == present
    }

}
