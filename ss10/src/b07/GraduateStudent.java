package b07;

public class GraduateStudent extends Student {
    private String researchTopic;
    private String supervisorName;

    public GraduateStudent(String name, String id, double gpa, String researchTopic, String supervisorName) {
        super(name, id, gpa);
        if (isValidResearchTopic(researchTopic) && isValidSupervisorName(supervisorName)) {
            this.researchTopic = researchTopic;
            this.supervisorName = supervisorName;
        } else {
            System.out.println("Dữ liệu không hợp lệ. Không thể tạo đối tượng GraduateStudent.");
        }
    }

    private boolean isValidResearchTopic(String researchTopic) {
        return researchTopic != null && !researchTopic.trim().isEmpty();
    }

    private boolean isValidSupervisorName(String supervisorName) {
        return supervisorName != null && !supervisorName.trim().isEmpty();
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    public void setResearchTopic(String researchTopic) {
        if (isValidResearchTopic(researchTopic)) {
            this.researchTopic = researchTopic;
        } else {
            System.out.println("Đề tài nghiên cứu không hợp lệ.");
        }
    }

    public String getSupervisorName() {
        return supervisorName;
    }

    public void setSupervisorName(String supervisorName) {
        if (isValidSupervisorName(supervisorName)) {
            this.supervisorName = supervisorName;
        } else {
            System.out.println("Tên giảng viên hướng dẫn không hợp lệ.");
        }
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Đề tài: " + researchTopic + ", GVHD: " + supervisorName;
    }
}
