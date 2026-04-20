interface Motor {
    void renderizar();
}

class ControleMotorGrafico {

    void init (Motor motor) {
        motor.renderizar();
    }
}

class AdaptadorMotorAMD implements Motor {
    private MotorAMD motorAMD;

    public AdaptadorMotorAMD(MotorAMD motorAMD) {
        this.motorAMD = motorAMD;
    }

    @Override
    public void renderizar() {
        motorAMD.render();
    }
}

class AdaptadorMotorNvidia implements Motor {
    private MotorNvidia motorNvidia;

    public AdaptadorMotorNvidia(MotorNvidia motorNvidia) {
        this.motorNvidia = motorNvidia;
    }

    @Override
    public void renderizar() {
        motorNvidia.renderizar_video();
    }
}
