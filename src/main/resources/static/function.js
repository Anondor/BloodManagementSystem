

       function selectDistrict(s1,s2)
        {
            var s1=document.getElementById(s1);
            var s2=document.getElementById(s2);

            s2.innerHTML= "";

            if(s1.value=="barishal")
            {
                var optionArray=['choose|Choose District','barguna|Barguna','barishal|Barishal','bhola|Bhola','jhalokati|Jhalokati','patuakhali|Patuakhali','pirojpur|Pirojpur'];
            }
            else if(s1.value =="chittagong"){
                var optionArray=['choose|Choose District','bandarban|Bandarban','brahmanbaria|Brahmanbaria','chandpur|Chandpur','chattogram|Chattogram','cumilla|Cumilla',
                'coxsBazar|Cox\'s Bazar','feni|Feni','khagrachhari|Khagrachhari','lakshmipur|Lakshmipur','noakhali|Noakhali','rangamati|Rangamati'];
            }
            else if(s1.value=='dhaka')
            {
                var optionArray=['choose|Choose District','dhaka|Dhaka','faridpur|Faridpur','gazipur|Gazipur','gopalganj|Gopalganj','kishoreganj|Kishoreganj',
                'madaripur|Madaripur','manikganj|Manikganj','munshiganj|Munshiganj','narayanganj|Narayanganj','narsingdi|Narsingdi','rajbari|Rajbari',
                'shariatpur|Shariatpur','tangail|Tangail'];

            }

            for(var option in optionArray)
            {
                var pair =optionArray[option].split("|");
                var newoption = document.createElement("option");
                newoption.value=pair[0];
                newoption.innerHTML=pair[1];
                s2.options.add(newoption);
            }


        }

        function selectThana(s1,s2)
        {
            var s1=document.getElementById(s1);
            var s2=document.getElementById(s2);

            s2.innerHTML= "";
            

 

            
            if(s1.value=="dhaka")
            {
                var optionArray=['choose|Choose Thana/Upozila','adabarThana|Adabar Thana','baddaThana|Badda Thana ','bangshalThana|Bangshal Thana','bhashantekThana|Bhashantek Thana ','bhataraThana|Bhatara Thana',
                'bimanBandarThana|Biman Bandar Thana ','cantonmentThana|Cantonment Thana ','chalkbazarThana|Chalkbazar Thana ','dakhinkhanThana|Dakhinkhan Thana ','darusSalamThana|Darus Salam Thana','DemraThana|Demra Thana ',
                'dhamraiUpazila|Dhamrai Upazila','dhanmondiThana|Dhanmondi Thana','doharUpazila |Dohar Upazila ',
                'gendariaThana|Gendaria Thana','gulshanThana|Gulshan Thana ',
                'hazaribagh Thana|Hazaribagh Thana','jatrabariThana|Jatrabari Thana ',
                'kadamtoliThana|Kadamtoli Thana','kafrulThana|Kafrul Thana',
                'savarUpazila|Savar Upazila'];
            }
            else if(s1.value =="b"){
                var optionArray=['xx|XX','yy|YY','zz|ZZ'];
            }
            else if(s1.value =="c"){
                var optionArray=['ppp|PPP','qqq|QQQ','rrr|RRR'];
            }

            for(var option in optionArray)
            {
                var pair =optionArray[option].split("|");
                var newoption = document.createElement("option");
                newoption.value=pair[0];
                newoption.innerHTML=pair[1];
                s2.options.add(newoption);
            }

        }

        function selectUnion(s1,s2)
        {
            var s1=document.getElementById(s1);
            var s2=document.getElementById(s2);

            s2.innerHTML= "";
            
            if(s1.value=="savarUpazila")
            {
                var optionArray=['choose|Choose Union','aminbazar|Aminbazar','ashulia|Ashulia ','birulia|Birulia','bongaon|Bongaon ','dhamsona|Dhamsona',
                'kaundia|Kaundia ','pathalia|Pathalia ','savar|Savar ','shimulia|Shimulia','tetuljhora|Tetuljhora','vakurta|Vakurta',
                'yearpur|Yearpur'];
            }
            else if(s1.value =="b")
            {
                var optionArray=['xx|XX','yy|YY','zz|ZZ'];
            }
            else if(s1.value =="c"){
                var optionArray=['ppp|PPP','qqq|QQQ','rrr|RRR'];
            }

            for(var option in optionArray)
            {
                var pair =optionArray[option].split("|");
                var newoption = document.createElement("option");
                newoption.value=pair[0];
                newoption.innerHTML=pair[1];
                s2.options.add(newoption);
            }


        }


    