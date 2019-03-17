import Hello from "../src/components/Hello";

describe("Tautology", () => {

    it("should be true", () => {
        expect(true).toBeTruthy();
    });

    it("has no members", () => {
        expect(true).not.toHaveProperty("length");
    });

});