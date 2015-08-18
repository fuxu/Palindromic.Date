require 'date'
class Palindromic
    def initialize(year)
        @year = year
        tmp = year.to_s.reverse.unpack("a2a2")
        @month = tmp[0].to_i
        @day = tmp[1].to_i
    end
    def valid()
        begin
            tmp = Date.new(@year,@month,@day)
            true
        rescue
            false
        end
    end
    def to_s()
        "#{@year}#{'%02d'%@month}#{'%02d'%@day}"
    end
end

if __FILE__ == $0
    (1011..2999).each do |n|
        a = Palindromic.new(n)
        if a.valid then
            puts a
        end
    end
end
