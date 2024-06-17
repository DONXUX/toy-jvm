public class BytecodeInterpreter {
    private byte[] bytecode;
    private int pc; // Program Counter

    public BytecodeInterpreter(byte[] bytecode) {
        this.bytecode = bytecode;
        this.pc = 0;
    }

    public void interpret() {
        while (pc < bytecode.length) {
            int opcode = bytecode[pc] & 0xFF;
            switch (opcode) {
                case 0x00: // nop
                    pc++;
                    break;
                case 0x01: // aconst_null
                    // 스택에 null을 푸시
                    pc++;
                    break;
                // 추가적인 바이트코드 명령어 처리
                default:
                    throw new UnsupportedOperationException("Unsupported opcode: " + opcode);
            }
        }
    }
}
