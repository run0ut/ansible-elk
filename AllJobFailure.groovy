allJobs = Jenkins.instance.getAllItems(Job.class)
for (item in allJobs) {
  // println item.fullName
  hasFails = 0
  for (build in item.builds){
    if (build.result == Result.FAILURE) {
      hasFails = hasFails + 1
    }
  }
  if (hasFails > 0){
    println 'Number of fails: ' + hasFails + ', job: "' + item.fullName + '"'
  }
}